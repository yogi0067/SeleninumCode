from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(executable_path=r"C:\Users\think\Downloads\chromedriver_win32\chromedriver.exe")


driver.get('https://www.facebook.com/')
print(driver.title)