from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.common.exceptions import NoSuchElementException, ElementClickInterceptedException, NoSuchElementException
from selenium.webdriver.common.action_chains import ActionChains
import time
import re
import json

class LinkedinApplication:
    # Constructor to initialize the class
    def __init__(self, data):
      self.email = data['email']
      self.password = data['password']
      self.keywords = data['keywords']
      self.location = data['location']
      self.driver = webdriver.Chrome(data['driverURL'])


    # Method to login to Linkedin
    def login(self):
       
      # navigate to linkedin
      self.driver.get('https://www.linkedin.com/')
      # wait for the page to load
      wait = WebDriverWait(self.driver, 10)
      
      # find the email field and enter the email
      # since selenium 4.3, this requires that you use the 'xpath' locator
      email = self.driver.find_element('xpath', '//*[@id="session_key"]')
      email.clear()
      email.send_keys(self.email)

      # find the password field and enter the password
      password = self.driver.find_element('xpath', '//*[@id="session_password"]')
      password.clear()
      password.send_keys(self.password)

  
      # email.clear()
      # email.send_keys(self.email)


    def close_session(self):
       self.driver.close()




if __name__ == "__main__":

  with open('../config.json') as config_file:
     data = json.load(config_file)

     bot = LinkedinApplication(data)

     bot.login()

     time.sleep(20)

     bot.close_session()