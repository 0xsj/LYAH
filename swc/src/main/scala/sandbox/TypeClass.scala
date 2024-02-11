package sandbox

// trait that can only be extended within the same file or compilation unit where its defined
// all subclasses of a ssealed trait must be defined in the same file as the traight it self.
sealed trait Json;

// represents a JSOn object, collection of key value pairs
final case class JsObject(get: Map[String, Json]) extends Json;
// this is different from a rgular string per say. a String doesn't have to necessarily mean the Json structure
// JsString refers to the specific String in the Json.
final case class JsString(get: String) extends Json;
final case class JsNumber(get: Double) extends Json;
final case object JsNull extends Json;

// a trait, sort of like a interface in other languages
// can contain method singatures, fields, and concrete implementations
// JsonWriter is a generic trait with type param A, allowing JsonWriter to work with values of any type
trait JsonWriter[A] {
  // takse a value of A, and returns a type Json
  def write(value: A): Json;
}

// Instances
// 1.1.2 type Class Instances
final case class Person(name: String, email: String);

object JsonWriterInstances {
  implicit val stringWriter: JsonWriter[String] =
    new JsonWriter[String] {
      def write(value: String): Json =
        JsString(value)
    }

  // instance of the JsonWriter, but paramterized with specific type Person
  implicit val personWriter: JsonWriter[Person] =
    new JsonWriter[Person] {
      def write(value: Person): Json =
        JsObject(
          Map(
            "name" -> JsString(value.name),
            "email" -> JsString(value.email)
          )
        )
    }
}

/** Implicit: Correct, in Scala, "implicit" refers to declarations that are
  * automatically used by the compiler in certain contexts, such as implicit
  * conversions, implicit parameters, or implicit classes. It doesn't directly
  * equate to "private" or visibility modifiers in other languages.
  *
  * Implicit conversion: This is a mechanism where the compiler automatically
  * converts one type to another when needed. For example, converting a value of
  * type Int to Double when performing arithmetic operations.
  *
  * Implicit parameter: An implicit parameter is a parameter of a method or
  * function that doesn't need to be explicitly passed by the caller. Instead,
  * the compiler looks for an implicit value of the appropriate type in the
  * current scope and automatically passes it.
  *
  * Implicit class: This allows you to extend existing types with new methods
  * without modifying their original definition. Implicit classes are often used
  * to enrich existing types with additional functionality.
  *
  * Trait: Correct, a trait in Scala is similar to an interface in other
  * languages. It defines a set of methods and fields that can be implemented by
  * classes. Traits can also contain concrete method implementations.
  *
  * Type parameter: Also known as a "generic type parameter," this refers to a
  * placeholder for a specific type that can be defined when using a type or
  * class. For example, JsonWriter[A] defines a type parameter A, which can be
  * instantiated with specific types like String or Person.
  */
