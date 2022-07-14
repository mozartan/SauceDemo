# SauceDemo
# In this Project, The saucedemo.com was tested.
# Required Software and Tools
This code is prepared in IntelliJ IDEA IDE. In addition, the language used is JAVA 8 and above. Maven 11 Build tool is used.

# Installing the program
HTTPS is copied from the green code section on the program page opened in Githup. In IntelliJ program, File<New<Project from Version Control is selected. 
On the page that opens, the copied HTTPS is pasted into the URL part. By clicking the Clone button, the project is loaded into the IntelliJ program. 
After the project is loaded, the updates are downloaded by clicking Download Sources and/or Documents (Underlined Down Arrow icon) from the maven tab in the far right corner of the page that opens.

# Running the Test
In order to run the project and generate an HTML report, SauceDemo<Lifecycle<clean is selected from the maven tab in the far right corner. 
Then SauceDemo<Lifecycle<install is selected. Finally, the project is run by selecting SauceDemo<Lifecycle<verify. 
After the project is completed, under the Project tab in the far left corner, right click on SauceDemo<target<cucumber-html-repots<overview-features.html and select Open In < Browsers < Chrome (Firefox, Safari, ..). In the browser, the entire view of the project, including the screnshots, is included in the report as HTML.

To run the project without getting a report, SauceDemo<src<test<java<com.SauceDemo<runners<CukesRunner page is opened on the main screen under the Project tab in the far left corner. The program is run by pressing the green run part next to the public class on the page that opens.

Test scenarios SauceDemo<src<test<resources<features<order.feature can be viewed in detail.

## Authors

* **Mustafa Özartan** - *Initial work* - [mozartan](https://github.com/mozartan)
