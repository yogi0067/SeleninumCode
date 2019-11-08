from selenium import webdriver
from selenium.webdriver.common.keys import Keys


#open the browser with
driver = webdriver.Chrome(r"D:\Learning\Python\Automation\selenium\Project\seleniumTest\venv\orbitz\tools\chromedriver.exe")
driver.get('https://www.orbitz.com/')
home = driver.find_element_by_xpath('//*[@id="primary-header-home"]')
hotels = driver.find_element_by_xpath('//*[@id="primary-header-hotel"]')
