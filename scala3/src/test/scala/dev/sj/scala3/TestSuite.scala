package dev.sj
package scala3

export org.scalacheck.Arbitrary
export org.scalacheck.Cogen
export org.scalacheck.Gen

trait TestSuite extends munit.DisciplineSuite, Expectations
