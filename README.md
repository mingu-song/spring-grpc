## gRPC Spring Boot
### yidongnan / grpc-spring-boot-starter
* https://github.com/yidongnan/grpc-spring-boot-starter
* https://yidongnan.github.io/grpc-spring-boot-starter/en/server/getting-started.html
### LogNet / grpc-spring-boot-starter 
* https://github.com/LogNet/grpc-spring-boot-starter

### 대략적으로...
* 둘다 비슷한 어노테이션과 구조를 가지고 있다. 
* LogNet 이 조금 더 나아보이지만, 여기서는 yidongnan 사용함
* grpc-lib : idea 를 이용하여 제너레이트 된 파일을 소스셋에 포함시킨다.
* server : `grpc-server-spring-boot-starter` 사용, `@GrpcService` 로 서비스 구현
* client : `grpc-client-spring-boot-starter` 사용, `@GrpcClient("grpc-client")` 로 stub bean 생성
    * `grpc-client` 라는 이름으로 application.yml 에 정의된 property 사용하여 채널 생성
* 서버, 클라이언트 구분없이 `grpc-spring-boot-starter` 하나로 사용해도 됨 