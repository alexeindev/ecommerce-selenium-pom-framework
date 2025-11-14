# 🛒 E-Commerce Test Automation Framework

## 📋 Overview

End-to-end test automation framework for the Automation Test Store e-commerce platform. This project demonstrates proficiency in automated testing practices, including UI testing, test design patterns, and continuous integration.

**Application Under Test:** [https://automationteststore.com/](https://automationteststore.com/)

![Project Banner](./images/banner.png)

## 🎯 Project Objectives

- Build a scalable and maintainable test automation framework from scratch
- Implement industry-standard testing practices and design patterns
- Validate critical e-commerce user flows
- Demonstrate CI/CD integration capabilities

## ✨ Key Features Tested

- User registration and login flows
- Product search and filtering
- Shopping cart operations (add, update, remove items)
- Checkout process validation
- Responsive design testing
- Form validations and error handling

## 🛠️ Tech Stack

- **Java:** 21 LTS (latest production version)
- **Build tool:** Maven 3.9.x
- **Test framework:** TestNG 7.x
- **Web automation:** Selenium WebDriver 4.25+
- **Design pattern:** Page Object Model (classic implementation)
- **Assertions:** AssertJ 3.25+

## 🚀 Getting Started

### Prerequisites

- Java 21 LTS or higher
- Maven 3.9.x
- ChromeDriver (or your preferred browser driver)
- Git

### Installation

### Running Tests

```bash
# Run all tests
mvn test

# Run specific test suite
mvn test -Dtest=CartTests

# Run with specific browser
mvn test -Dbrowser=chrome

# Generate test report
mvn surefire-report:report
```

## 📊 Test Coverage

| Feature | Test Cases | Status |
|---------|-----------|--------|
| User Authentication | 5 | Pass |
| Product Browsing | 8 | Pass |
| Shopping Cart | 10 | Pass |
| Checkout Flow | 7 | Pass |
| **Total** | **30** | **Pass** |

## Test Execution Results

![Test Results](./images/test-results.png)

## 🎨 Design Patterns Implemented

### Page Object Model (POM)
Separates page structure from test logic for better maintainability and reusability.

### Data-Driven Testing
Parameterized tests to validate multiple scenarios with different datasets.

### Explicit Waits
Smart waiting strategies to handle dynamic content and improve test stability.

## 📈 CI/CD Integration

Tests are automatically executed on:
- Every push to main branch
- Pull request creation
- Scheduled nightly runs

![CI/CD Pipeline](./images/cicd-pipeline.png)

View the latest test results in the [Actions tab](link-to-actions).

## 🏆 Key Achievements

- **100% Pass Rate:** All critical user flows validated
- **Fast Execution:** Average test suite completion in under 5 minutes
- **Zero Flaky Tests:** Reliable and consistent test results
- **Clean Code:** Follows coding standards with comprehensive documentation

## 📝 Test Scenarios

For detailed test scenarios and test cases, see the [Test Scenarios Document](./docs/test-scenarios.md).

## Sample Test Report

![Sample Report](./images/sample-report.png)

## Lessons Learned

- Importance of robust element locators for stable tests
- Effective use of explicit waits over implicit waits
- Value of test data management strategies
- Benefits of modular test architecture

## 🚧 Future Enhancements

- API testing integration
- Visual regression testing
- Performance testing
- Cross-browser testing (Firefox, Safari)
- Mobile responsive testing
- Database validation


**Star this repository if you find it helpful!**
*This is a practice project using a demo e-commerce site. No real transactions are processed.*