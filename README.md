# springmvcLearn

## 專案概述

springmvcLearn 是一個基於 Java 的學習專案，旨在練習 Spring MVC 相關的概念與操作。專案按照不同的學習目標進行區分，每個子模組包含相關的測試程式與實現程式碼。

## 專案結構

```
springmvcLearn/
├── pom.xml (父模組)
├── spring_mvc01_helloworld/
│   └── pom.xml (子模組 spring_mvc01_helloworld)
├── spring_mvc02_demo/
│   └── pom.xml (子模組 spring_mvc02_demo)
├── spring_mvc03_rest/
│   └── pom.xml (子模組 spring_mvc03_rest)
├── spring_mvc04_ajax/
│   └── pom.xml (子模組 spring_mvc04_ajax)
├── spring_mvc05_extension/
│   └── pom.xml (子模組 spring_mvc05_extension)
├── spring_mvc06_annotation/
│   └── pom.xml (子模組 spring_mvc06_annotation)
└── spring_mvc07_spring_listener/
    └── pom.xml (子模組 spring_mvc07_spring_listener)

```

### 1. springmvcLearn


- **目標：** 管理所有子模組共同的依賴與版本。

  
### 2. spring_mvc01_helloworld


- **目標：** 於 Spring MVC 設定檔設定相關訊息，並於測試跳轉時使用 Thymeleaf 進行渲染。

### 3. spring_mvc02_demo


- **目標 1：** 使用 @RequestMapping 注解、了解其不同屬性、ant 風格及佔位符。
- **目標 2：** 使用 @RequestParam 注解。
- **目標 3：** 使用 @RequestHeader 注解和 @CookieValue 注解。
- **目標 4：** 透過 pojo 獲取參數。
- **目標 5：** 處理 Request 範圍的共享資料，使用 ModelAndView、Model、ModelMap 及 Map。
- **目標 6：** 處理 Session 範圍的共享資料。
- **目標 7：** 處理 Application 範圍的共享資料。
- **目標 8：** 使用 ThymeleafView、RedirectView 處理重定向畫面。
- **目標 9：** 使用 InternalResourceView 處理內部轉交畫面。
- **目標 10：** 使用 view-controller 設定請求的重定向畫面。

### 4. spring_mvc03_rest


- **目標 1：** 了解 REST(Representational State Transfer) 表現層狀態轉換概念。
- **目標 2：** RESTful 的實現。
- **目標 3：** 使用 HiddenHttpMethodFilter 處理 put 和 delete 請求。

### 5. spring_mvc04_ajax


- **目標 1：** 使用 @RequestBody 注解處理 json 格式資料。
- **目標 2：** 使用基本 Vue 搭配 Axios 發送 Ajax 請求。
- **目標 3：** 使用 @ResponseBody 注解響應 json 格式資料。
- **目標 4：** 了解複合注解 @RestController 替代 @Controller 注解和 @ResponseBody 注解的使用。
- **目標 5：** 實現基本上傳和下載功能。

### 6. spring_mvc05_extension


- **目標 1：** 攔截器的建立與設定。
- **目標 2：** 使用 XML 設定異常處理。
- **目標 3：** 使用注解設定異常處理。

### 7. spring_mvc06_annotation


- **目標 ：** 使用配置類和注解代替 web.xml 和 Spring MVC 設定檔案的功能。

### 8. spring_mvc07_spring_listener


- **目標 1：** 了解 SSM 整合概念，即 Spring 和 Spring MVC 是否使用同一個 IOC 管理組件。
- **目標 2：** 了解 Spring 提供的監聽器 ContextLoaderListener，其實作 ServletContextListener 介面，可監聽 ServletContext 的狀態，在 web 服務啟動時讀取 Spring 的設定檔案，建立 Spring 的 IOC 容器。

## 設定檔

- `springmvc.xml`： Spring MVC 設定檔。

## 相關版本

- JDK 版本： 11
- Spring MVC 版本： 5.3.1
- Maven 版本： 3.9.9
- Tomcat 9.0.83

## 使用方式

1. **安裝依賴：** 確保已安裝 JDK 和相關資料庫，並設定相關依賴。
2. **導入專案：** 使用 IDE（如 IntelliJ IDEA 或 Eclipse）導入專案。
3. **執行測試：** 選擇並運行對應的測試類進行學習。

## 注意事項

- 在執行涉及資源的操作時，請檢查相關文件路徑是否有效。

## 主要學習資源

- Servlet & JSP技術手冊 : 邁向Spring Boot 作者：林信良。
- 【尚硅谷】SSM框架全套教程，MyBatis+Spring+SpringMVC+SSM整合一套通關。

## 貢獻者

此專案僅為學習用途。