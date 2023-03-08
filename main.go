package main

import (
	"fmt"

	"github.com/go-rod/rod"
)

type LinkedinApplication struct {
	email     string
	password  string
	keywords  string
	location  string
	driverURL string
}

// this will work similarly like a constructor, where it creates a new isntance of the struct defined
// initializes values from the data map, and reutrns a pointer to the instance.
func NewApplication(data map[string]string) *LinkedinApplication {
	return &LinkedinApplication{
		email:     data["email"],
		password:  data["password"],
		keywords:  data["keywords"],
		location:  data["location"],
		driverURL: data["driverURL"],
	}
}

// Job Search

func (e *LinkedinApplication) Login() error {
	// first, we go to the login url / page
	page := rod.New().MustConnect().MustPage("https://www.linkedin.com/")
	page.MustWindowFullscreen()
	page.MustElement("#username").MustInput(e.email)
	page.MustElement("#password").MustInput(e.password)
	page.MustElement(".login__form_action_container").MustClick()

	return nil
}

// search for the job
func (e *LinkedinApplication) JobSearch() error {
	return nil
}

// filter through the jobs
func (e *LinkedinApplication) FilterJobs() error {
	return nil
}

func (e *LinkedinApplication) FindOffers() error {
	return nil
}

func (e *LinkedinApplication) Apply() error {
	return nil
}

func (e *LinkedinApplication) Run() error {
	return nil
}

func (e *LinkedinApplication) LogResults() error {
	return nil
}

func main() {
	data := map[string]string{
		"email":     "from func main, test",
		"password":  "from func main, test",
		"keywords":  "from func main, test",
		"location":  "from func main, test",
		"driverURL": "from func main, test",
	}
	application := NewApplication(data)
	fmt.Println(application.email)
	err := application.Login()
	if err != nil {
		fmt.Println(err)
	}
}
