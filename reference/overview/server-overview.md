# 서버 사이드 개발에서의 코틀린 사용

Kotlin은 기존 자바 기반 기술 스택과의 호환성 그리고 유연한 학습 곡선을 유지하면서 간결하고 표현이 풍부한 코드를 작성하는 서버 사이드 어플리케이션을 작성하는데 매우 적합하다 :

 * **표현력**: [type-safe builders](/docs/reference/type-safe-builders.html)와 [delegated properties](/docs/reference/delegated-properties.html)을 지원함으로서 Kotlin의 혁신적인 언어 기능들은 강력하고 사용하기 쉬운 추상화를 구축하는데 도와준다.
 * **확장성**: Kotlin의 [coroutines](/docs/reference/coroutines.html) 지원은 적당한 하드웨어 요구 사항으로 많은 수의 클라이언트에게 확장할 수 있는 서버 사이드 애플리케이션을 구축하는데 도와준다.
 * **상호 운용성**: Kotlin은 모든 Java 기반 프레임워크와 완벽하게 호환되므로 최신 언어의 이점을 누리면서 친숙한 기술 스택을 유지할 수 있다.
 * **마이그레이션**: Kotlin은 Java에서 Kotlin으로의 많은 코드베이스를 마이그레이션하는 것을 단계 단계마다 점진적으로 지원한다.
 * **Tooling**: 일반적으로 훌룐한 IDE 지원 외에도, Kotlin은 IntlliJ IDEA Ultimate용 플러그인에 프레임워크-전용 도구(예, Spring)를 제공합니다.
 * **학습 곡선**: Java 개발자의 경우, Kotlin을 시작하는 것은 매우 쉽습니다. Kotlin 플러그인에 포함된 자동화 Java to Kotlin 변환기가 첫 번째 단계를 도와줍니다. [Kotlin Koans](/docs/tutorials/koans.html)는 일련의 대화식 연습와 함께 언어의 주요 기능들을 가이드를 통해 제공합니다.

## Kotlin으로 서버 사이드 개발 프레임워크

 * [Spring](https://spring.io) Kotlin의 언어 기능을 사용하여 5.0부터 시작하여 [more concise APIs](https://spring.io/blog/2017/01/04/introducing-kotlin-support-in-spring-framework-5-0)를 만듭니다. [online project generator](https://start.spring.io/#!language=kotlin)는 신속하게 Kotlin의 새로운 프로젝트를 생성할 수 있습니다.

 * JVM에서 리액티브 웹 애플리케이션을 구축하기 위한 프레임워크인 [Vert.x](http://vertx.io)는 [full documentation](http://vertx.io/docs/vertx-core/kotlin/).를 포함하여 Kotlin에 대한 [dedicated support](https://github.com/vert-x3/vertx-lang-kotlin)을 제공합니다.

 * [Ktor](https://github.com/kotlin/ktor)은 JetBrains이 개발한 Kotlin 고유의 웹 프레임워크로, 높은 확장성을 위해 coroutines의 사용을 제공하고 사용하기 쉽고 관용적인 API를 제공합니다.

 * [kotlinx.html](https://github.com/kotlin/kotlinx.html)은 웹 애플리케이션에서 HTML을 작성하는데 사용할 수 있는 DSL입니다. JSP와 FreeMarker와 같은 기존 템플릿 시스템의 대안으로 사용됩니다.

 * 지속성을 위해 사용할 수 있는 옵션들은 직접 JDBC 접근, JPA와 Java 드라이버를 통한 NoSQL 데이터베이스 사용이 포함됩니다. JPA의 경우, [kotlin-jpa compiler plugin](/docs/reference/compiler-plugins.html#kotlin-jpa-compiler-plugin)은 프레임워크의 요구사항에 맞게 Kotlin로 컴퍼일된 클래스들을 조정합니다.

## 코틀린 서버 사이드 애플리케이션 배포

 코틀린 애플리케이션은 아마존 웹 서비스, 구글 클라우드 플랫폼 등을 포함하여 Java 웹 애플리케이션을 지원하는 많은 호스트에 배포할 수 있습니다.

 [Heroku](https://www.heroku.com)에서 Kotlib 애플리케이션을 배포하려면, [official Heroku tutorial](https://devcenter.heroku.com/articles/getting-started-with-kotlin)을 따라할 수 있습니다.

 AWS Labs는 [AWS Lambda](https://aws.amazon.com/lambda/) functions를 작성하기 위한 Kotlin의 사용법을 보여주는 [sample project](https://github.com/awslabs/serverless-photo-recognition)를 제공합니다.

## 서버 사이드 Kotlin 사용자

 [Corda](https://www.corda.net/2017/01/10/kotlin/)는 주요 은행이 지원하는 오픈소스 분산 원장 플랫폼으로, 전적으로 Kotlin으로 구축되었습니다.

 전체 라이센스 판매와 검증 프로셋를 담당하는 시스템인 [JetBrains Account](https://account.jetbrains.com/)는 100% 코틀린으로 작성되었고 2015년부터 주요 이슈없이 운영되고 있습니다.

## 다음 단계

 * [Creating Web Applications with Http Servlets](/docs/tutorials/httpservlets.html) 및 [Creating a RESTful Web Service with Spring Boot](/docs/tutorials/spring-boot-restful.html) 튜토리얼은 Kotlin으로 매우 작은 웹 애플리케이션을 구축하고 실행하는 방법을 보여줍니다.
 * 언어에 대한 심층적인 소개는 이 사이트와 [Kotlin Koans](/docs/tutorials/koans.html)의 [reference documentation](/docs/reference/index.html)를 확인하십시오. 