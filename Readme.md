

# Mô tả project: 
- Gồm 3 project con demo full các chức năng discovery, giao tiếp internal giữa các microservice trong hệ thống sử dụng feign, cung cấp restful APIs cho phía Client tích hợp, kết nối Database, Feign client,  ...

- discovery service: eureka-discovery-service: là project đóng vài trò registra service trong tổng thể hệ thống Microservice, cho phép các microservice khác đăng ký định danh.

- main business service: currency-conversion-service, kết nối với forex-service để lấy thông tin về current curency rate và trả về response cho Client.
- another internal service: forex-service
- Ví dụ demo 2 trường hợp giao tiếp trực tiếp thông qua resttemplate và thông qua feign client

# Hướng dẫn build & run
(với jdk version >= 17)

- Có thể mở project = Visual studio code hoặc Netbeans (ở đây tôi khuyến nghị sử dụng VS Code cho gọn nhẹ và tuỳ biến các command chạy)
- cd vào thư mục project: 
++ cd rest-service-basic
++ mvn clean
++ mvn compile (hoặc "mvn install" nếu muốn build thành file .jar)
++ mvn test (để test) hoặc
++ mvn spring-boot:run (để chạy project)  (nếu sử dụng VS Code có thể tạo tạo launch.json file để định nghĩa run&debug profile - hoặc mở trực tiếp file RestServiceApplication.java chuột phải & chọn "run" hoặc "debug")

# Hướng dẫn test:
- Khuyến nghị sử dụng Postman để có thể test đồng thời tất cả các APIs của project (cả API GET và POST)
++ Các APIs có thể xem chi tiết trong file: 
    +++ currency-conversion-service\src\main\java\com\phanpc\springboot\microservice\example\currencyconversion\CurrencyConversionController.java
    +++ forex-service\src\main\java\com\phanpc\springboot\microservice\example\forex\ForexController.java

# Liên hệ:
    - phanpc@gmail.com