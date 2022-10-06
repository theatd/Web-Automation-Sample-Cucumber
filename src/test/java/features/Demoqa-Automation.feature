@Demo-QA
Feature: Demo QA automation scenarios
  A collection of test scenarios for DemoQA website
  Background: Navigate to the page
    Navigates to the page
    * Navigate to url: https://demoqa.com/

  @Element_Page
  Scenario: Element page steps
    A Scenario to check the Element page elements
    * Click the Elements on the HomePage
    * Verify presence of element page_title on the ElementPage
    
   @Element_Textbox_Page
   Scenario: Element Textbox page steps
    A Scenario to check the Element Textbox page elements
    * Click the Elements on the HomePage
    * Click the Textbox on the ElementPage
    * Verify presence of element page_title on the ElementPage
   
    @Element_Textbox_Page_field_check
    Scenario: Element Textbox page steps
     A Scenario to check the Element Textbox page fields
     * Click the Elements on the HomePage
     * Click the Textbox on the ElementPage
     * Fill component input username of userForm component on the ElementPage with text: test_name
     * Fill component input address of userForm component on the ElementPage with text: test_address
     * Fill component input permanentaddress of userForm component on the ElementPage with text: test_paddress
     * Fill component input email of userForm component on the ElementPage with text: test@email.com
     * Click button with Submit text  
     * Verify the text of name on the ElementPage to be: Name:test_name
     * Verify the text of email on the ElementPage to be: Email:test@email.com
     * Verify the text of current_address on the ElementPage to be: Current Address :test_address
     * Verify the text of permanent_address on the ElementPage to be: Permananet Address :test_paddress   
     
    
   @Form_Page
   Scenario: Form page steps
    A Scenario to check the Element page elements
    * Click the Forms on the HomePage
    * Verify presence of element title on the FormPage
    * Click the Practice_Form on the FormPage
    * Verify presence of element Student_Registration_Form on the FormPage
    
  
    
    