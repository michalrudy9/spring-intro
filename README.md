# Wprowadznie do Spring Framework
### [Spring framework](https://docs.spring.io/spring/docs/current/spring-framework-reference/)

### Spring Dependency Injection - konfiguracja w XML
+. Zainstaluj środowisko IntelliJ IDEA.
+. Wykonaj `fork` tego projektu.
+. Zaimportuj projekt do IntelliJ:
+. W pliku `com.example.MyNameMessageServiceTest` w teście `shouldReturnMyNameAsMessage` ustaw wartość zmiennej `expectedMessage` na swoje imię i nazwisko (np. `String expectedMessage = "Jan Kowalski`).
+. Uruchom test`MyNameMessageServiceTest`, upewnij się że nie działa.
+. Wprowadź odpowiednie zmiany w klasie `com.example.MyNameMessageService` aby naprawić niedziałający test. 
+. Uruchomi metodę `main` w klasie `MyApp`, upewnij się że Twoje imię i nazwisko jest wyświetlane na ekranie.
+. Dodaj klasę `RandomTextMessageService` implementującą `MessageService`. Klasa ta jako swój atrybut powinna posiadać tablicę (lub dowolny kontener) zawierającą 10 różnych wiadomości. Metoda `getMessage` tej klasy powinna zwracać losowo jedną z wiadomości przechowywanych wewnątrz klasy.
+. Zmodyfikuj plik `applicationContext.xml` tak, aby uruchamiając metodę `main` w klasie `MyApp` wykorzystywana była klasa `RandomTextMessageService` a nie `MyNameMessageService`.
+. W metodzie `main` klasy `MyApp` dodaj drugą zmienną typu `MessageService`, przypisz to niej ten sam Spring Bean co do wcześniejszej zmiennej.
+. Wypisz na ekran hashCode obu zmiennych - czy są one identyczne?
+. Zmodyfikuj plik `applicationContext.xml` i zmień scope bean'a `messageService` na taki, aby hashCode powyższych zmiennych był różny.
+. W pliku `applicationContext.xml` zakomentują linię z `<bean></bean>` i odkomentuj linię z `<component-scan>`.
+. Do klasy `MyNameMessageService` dodaj adnotację `@Component("messageService")`.
1. Do klasy `RandomTextMessageService` dodaj właściwą adnotację `@Component` (taką, aby kod działał poprawnie).

### Spring Dependency Injection - konfiguracja w Javie
1. Skopiuj poprzedni kod albo zmodyfikuj go w taki sposób, aby być w stanie zademonstrować działanie obu zadań bez konieczności komentowania/zmian kodu
1. Usuń z kodu plik `applicationContext.xml` i zastąp go konfiguracją w Jaview. Podpowiedzi jak to zrobić można znaleźć [tutaj](https://www.tutorialspoint.com/spring/spring_java_based_configuration.htm).
1. Należy wprowadzić takie zmiany, aby projekt się kompilował i testy przechodziły.
