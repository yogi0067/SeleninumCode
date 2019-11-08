from selenium import webdriver
from selenium.webdriver.common.keys import  Keys
from selenium.webdriver.support.select import Select


driver = webdriver.Chrome(r'D:\Learning\Python\Automation\selenium\Project\seleniumTest\venv\orbitz\tools\chromedriver.exe')
driver.get(r'https://www.orbitz.com/')
driver.find_element_by_xpath(r'//*[@id="tab-flight-tab-hp"]').click()
round_trip = driver.find_element_by_xpath(r'//*[@id="flight-type-roundtrip-label-hp-flight"]')
one_way = driver.find_element_by_xpath(r'//*[@id="flight-type-one-way-label-hp-flight"]')
multi_city = driver.find_element_by_xpath(r'//*[@id="flight-type-multi-dest-label-hp-flight"]')
flying_from = driver.find_element_by_xpath(r'//*[@id="flight-origin-hp-flight"]')
flying_to = driver.find_element_by_xpath(r'//*[@id="flight-destination-hp-flight"]')
departing_date =driver.find_element_by_xpath(r'//*[@id="flight-departing-hp-flight"]')
returning_date = driver.find_element_by_xpath(r'//*[@id="flight-returning-hp-flight"]')
adult = Select(driver.find_element_by_xpath(r'//*[@id="flight-adults-hp-flight"]'))
children = Select(driver.find_element_by_xpath(r'//*[@id="flight-children-hp-flight"]'))
age1 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-1-hp-flight"]'))
age2 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-2-hp-flight"]'))
age3 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-3-hp-flight"]'))
age4 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-4-hp-flight"]'))
age5 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-5-hp-flight"]'))
age6 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-6-hp-flight"]'))
adults = adult.options

advanced_options = driver.find_element_by_xpath(r'//*[@id="flight-advanced-options-hp-flight"]')
non_stop_flight = driver.find_element_by_xpath(r'//*[@id="advanced-flight-nonstop-hp-flight"]')
returnable_flight = driver.find_element_by_xpath(r'//*[@id="advanced-flight-refundable-hp-flight"]')
prefered_airline = Select(driver.find_element_by_xpath(r'//*[@id="flight-advanced-preferred-airline-hp-flight"]'))

print(len(adults))