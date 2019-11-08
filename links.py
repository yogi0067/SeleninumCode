from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(executable_path=r"C:\Users\think\Downloads\chromedriver_win32\chromedriver.exe")

driver.maximize_window()
driver.get('https://www.facebook.com/')
print(driver.title)
#signup
first_name = driver.find_element_by_xpath('//*[@id="u_0_m"]')
first_name.send_keys('test')
surname = driver.find_element_by_xpath('//*[@id="u_0_o"]')
surname.send_keys('test')
email = driver.find_element_by_xpath('//*[@id="u_0_r"]')
password = driver.find_element_by_xpath('//*[@id="u_0_w"]')
email.send_keys('test@test.test')
password.send_keys('12345')


