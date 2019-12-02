from selenium import webdriver
from selenium.webdriver.common.keys import  Keys
from selenium.webdriver.support.select import Select
class Flights:
    def __init__(self, driver):
        self.driver = webdriver.Chrome(r'venv\orbitz\tools\chromedriver.exe')
        self.flight_tab=driver.find_element_by_xpath(r'//*[@id="tab-flight-tab-hp"]').click()
        self.round_trip = driver.find_element_by_xpath(r'//*[@id="flight-type-roundtrip-label-hp-flight"]')
        self.one_way = driver.find_element_by_xpath(r'//*[@id="flight-type-one-way-label-hp-flight"]')
        self.multi_city = driver.find_element_by_xpath(r'//*[@id="flight-type-multi-dest-label-hp-flight"]')
        self.flying_from = driver.find_element_by_xpath(r'//*[@id="flight-origin-hp-flight"]')
        self.flying_to = driver.find_element_by_xpath(r'//*[@id="flight-destination-hp-flight"]')
        self.departing_date =driver.find_element_by_xpath(r'//*[@id="flight-departing-hp-flight"]')
        self.returning_date = driver.find_element_by_xpath(r'//*[@id="flight-returning-hp-flight"]')
        self.adult = Select(driver.find_element_by_xpath(r'//*[@id="flight-adults-hp-flight"]'))
        self.children = Select(driver.find_element_by_xpath(r'//*[@id="flight-children-hp-flight"]'))
        self.age1 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-1-hp-flight"]'))
        self.age2 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-2-hp-flight"]'))
        self.age3 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-3-hp-flight"]'))
        self.age4 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-4-hp-flight"]'))
        self.age5 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-5-hp-flight"]'))
        self.age6 = Select(driver.find_element_by_xpath(r'//*[@id="flight-age-select-6-hp-flight"]'))
        self.adults = adult.options
        self.advanced_options = driver.find_element_by_xpath(r'//*[@id="flight-advanced-options-hp-flight"]')
        self.non_stop_flight = driver.find_element_by_xpath(r'//*[@id="advanced-flight-nonstop-hp-flight"]')
        self.returnable_flight = driver.find_element_by_xpath(r'//*[@id="advanced-flight-refundable-hp-flight"]')
        self.preferred_airline = Select(driver.find_element_by_xpath(r'//*[@id="flight-advanced-preferred-airline-hp-flight"]'))
        self.preferred_class = Select(driver.find_element_by_xpath('//*[@id="flight-advanced-preferred-class-hp-flight"]'))
    def clickFlighttab():
        self.flight_tab.click()
    
    


