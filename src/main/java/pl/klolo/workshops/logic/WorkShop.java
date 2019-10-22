package pl.klolo.workshops.logic;

import pl.klolo.workshops.domain.Account;
import pl.klolo.workshops.domain.AccountType;
import pl.klolo.workshops.domain.Company;
import pl.klolo.workshops.domain.Currency;
import pl.klolo.workshops.domain.Holding;
import pl.klolo.workshops.domain.Sex;
import pl.klolo.workshops.domain.User;
import pl.klolo.workshops.mock.HoldingMockGenerator;
import pl.klolo.workshops.mock.UserMockGenerator;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

class WorkShop {
    /**
     * Lista holdingów wczytana z mocka.
     */
    private final List<Holding> holdings;

    private final Predicate<User> isWoman = user -> user.getSex().equals(Sex.WOMAN);
    private Predicate<User> isMan = m -> m.getSex() == Sex.MAN;

    WorkShop() {
        final HoldingMockGenerator holdingMockGenerator = new HoldingMockGenerator();
        holdings = holdingMockGenerator.generate();
    }

    /**
     * Metoda zwraca liczbę holdingów w których jest przynajmniej jedna firma.
     */
    long getHoldingsWhereAreCompanies() {

    }

    /**
     * Zwraca nazwy wszystkich holdingów pisane z małej litery w formie listy.
     */
    List<String> getHoldingNames() {

    }

    /**
     * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane.
     * String ma postać: (Coca-Cola, Nestle, Pepsico)
     */
    String getHoldingNamesAsString() {

    }

    /**
     * Zwraca liczbę firm we wszystkich holdingach.
     */
    long getCompaniesAmount() {

    }

    /**
     * Zwraca liczbę wszystkich pracowników we wszystkich firmach.
     */
    long getAllUserAmount() {

    }

    /**
     * Zwraca listę wszystkich nazw firm w formie listy. Tworzenie strumienia firm umieść w osobnej metodzie którą
     * później będziesz wykorzystywać.
     */
    List<String> getAllCompaniesNames() {

    }

    /**
     * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList. Obiektów nie przepisujemy
     * po zakończeniu działania strumienia.
     */
    LinkedList<String> getAllCompaniesNamesAsLinkedList() {

    }

    /**
     * Zwraca listę firm jako String gdzie poszczególne firmy są oddzielone od siebie znakiem "+"
     */
    String getAllCompaniesNamesAsString() {

    }

    /**
     * Zwraca listę firm jako string gdzie poszczególne firmy są oddzielone od siebie znakiem "+".
     * Używamy collect i StringBuilder.
     * <p>
     * UWAGA: Zadanie z gwiazdką. Nie używamy zmiennych.
     */
    String getAllCompaniesNamesAsStringUsingStringBuilder() {

    }

    /**
     * Zwraca liczbę wszystkich rachunków, użytkowników we wszystkich firmach.
     */
    long getAllUserAccountsAmount() {

    }

    /**
     * Zwraca listę wszystkich walut w jakich są rachunki jako string, w którym wartości
     * występują bez powtórzeń i są posortowane.
     */
    String getAllCurrencies() {

    }

    /**
     * Metoda zwraca analogiczne dane jak getAllCurrencies, jednak na utworzonym zbiorze nie uruchamiaj metody
     * stream, tylko skorzystaj z  Stream.generate. Wspólny kod wynieś do osobnej metody.
     *
     * @see #getAllCurrencies()
     */
    String getAllCurrenciesUsingGenerate() {
    }

    private List<String> getAllCurrenciesToListAsString() {

    }

    /**
     * Zwraca liczbę kobiet we wszystkich firmach. Powtarzający się fragment kodu tworzący strumień użytkowników umieść
     * w osobnej metodzie. Predicate określający czy mamy do czynienia z kobietą niech będzie polem statycznym w klasie.
     */
    long getWomanAmount() {

    }


    /**
     * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency.
     */
    BigDecimal getAccountAmountInPLN(final Account account) {

    }

    /**
     * Przelicza kwotę na podanych rachunkach na złotówki za pomocą kursu określonego w enum Currency i sumuje ją.
     */
    BigDecimal getTotalCashInPLN(final List<Account> accounts) {

    }

    /**
     * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek.
     */
    Set<String> getUsersForPredicate(final Predicate<User> userPredicate) {

    }

    /**
     * Metoda filtruje użytkowników starszych niż podany jako parametr wiek, wyświetla ich na konsoli, odrzuca mężczyzn
     * i zwraca ich imiona w formie listy.
     */
    List<String> getOldWoman(final int age) {

    }

    /**
     * Dla każdej firmy uruchamia przekazaną metodę.
     */
    void executeForEachCompany(final Consumer<Company> consumer) {
    }

    /**
     * Wyszukuje najbogatsza kobietę i zwraca ją. Metoda musi uzwględniać to że rachunki są w różnych walutach.
     */
    //pomoc w rozwiązaniu problemu w zadaniu: https://stackoverflow.com/a/55052733/9360524
    Optional<User> getRichestWoman() {

    }

    private BigDecimal getUserAmountInPLN(final User user) {
        return user.getAccounts()
                .stream()
                .map(this::getAccountAmountInPLN)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia.
     */
    Set<String> getFirstNCompany(final int n) {

    }

    /**
     * Metoda zwraca jaki rodzaj rachunku jest najpopularniejszy. Stwórz pomocniczą metodę getAccountStream.
     * Jeżeli nie udało się znaleźć najpopularniejszego rachunku metoda ma wyrzucić wyjątek IllegalStateException.
     * Pierwsza instrukcja metody to return.
     */
    AccountType getMostPopularAccountType() {

    }

    /**
     * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika wyrzuca
     * wyjątek IllegalArgumentException.
     */
    User getUser(final Predicate<User> predicate) {

    }

    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników.
     */
    Map<String, List<User>> getUserPerCompany() {

    }


    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników przechowywanych jako String
     * składający się z imienia i nazwiska. Podpowiedź:  Możesz skorzystać z metody entrySet.
     */
    Map<String, List<String>> getUserPerCompanyAsString() {
        BiFunction<String, String, String> joinNameAndLastName = (x, y) -> x + " " + y;
        return getCompanyStream().collect(Collectors.toMap(
                Company::getName,
                c -> c.getUsers()
                        .stream()
                        .map(u -> joinNameAndLastName.apply(u.getFirstName(), u.getLastName()))
                        .collect(Collectors.toList())
        ));
    }

    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników przechowywanych jako obiekty
     * typu T, tworzonych za pomocą przekazanej funkcji.
     */
    //pomoc w rozwiązaniu problemu w zadaniu: https://stackoverflow.com/a/54969615/9360524
    <T> Map<String, List<T>> getUserPerCompany(final Function<User, T> converter) {
        return getCompanyStream()
                .collect(Collectors.toMap(
                        Company::getName,
                        c -> c.getUsers()
                                .stream()
                                .map(converter)
                                .collect(Collectors.toList())
                ));
    }

    /**
     * Zwraca mapę gdzie kluczem jest flaga mówiąca o tym czy mamy do czynienia z mężczyzną, czy z kobietą.
     * Osoby "innej" płci mają zostać zignorowane. Wartością jest natomiast zbiór nazwisk tych osób.
     */
    Map<Boolean, Set<String>> getUserBySex() {
        Predicate<User> isManOrWoman = m -> m.getSex() == Sex.MAN || m.getSex() == Sex.WOMAN;
        return getUserStream()
                .filter(isManOrWoman)
                .collect(partitioningBy(isMan, mapping(User::getLastName, toSet())));
    }

    /**
     * Zwraca mapę rachunków, gdzie kluczem jest numer rachunku, a wartością ten rachunek.
     */
    Map<String, Account> createAccountsMap() {
        return getAccoutStream().collect(Collectors.toMap(Account::getNumber, account -> account));
    }

    /**
     * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń.
     */
    String getUserNames() {
        return getUserStream()
                .map(User::getFirstName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(" "));
    }

    /**
     * Zwraca zbiór wszystkich użytkowników. Jeżeli jest ich więcej niż 10 to obcina ich ilość do 10.
     */
    Set<User> getUsers() {
        return getUserStream()
                .limit(10)
                .collect(Collectors.toSet());
    }

    /**
     * Zapisuje listę numerów rachunków w pliku na dysku, gdzie w każda linijka wygląda następująco:
     * NUMER_RACHUNKU|KWOTA|WALUTA
     * <p>
     * Skorzystaj z strumieni i try-resources.
     */
    void saveAccountsInFile(final String fileName) {
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            Files.write(Paths.get(String.valueOf(lines)), (Iterable<String>) getAccoutStream()
                    .map(account -> account.getNumber() + "|" + account.getAmount() + "|" + account.getCurrency())
                    ::iterator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Zwraca użytkownika, który spełnia podany warunek.
     */
    Optional<User> findUser(final Predicate<User> userPredicate) {
        return getUserStream()
                .filter(userPredicate)
                .findAny();
    }

    /**
     * Dla podanego użytkownika zwraca informacje o tym ile ma lat w formie:
     * IMIE NAZWISKO ma lat X. Jeżeli użytkownik nie istnieje to zwraca text: Brak użytkownika.
     * <p>
     * Uwaga: W prawdziwym kodzie nie przekazuj Optionali jako parametrów.
     */
    String getAdultantStatus(final Optional<User> user) {
        return user.flatMap(u -> getUserStream().filter(u2 -> Objects.equals(u2, u)).findFirst())
                .map(u -> format("%s %s ma lat %d", u.getFirstName(), u.getLastName(), u.getAge()))
                .orElse("Brak użytkownika");
    }

    /**
     * Metoda wypisuje na ekranie wszystkich użytkowników (imię, nazwisko) posortowanych od z do a.
     * Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred Pasibrzuch, Adam Wojcik
     */
    void showAllUser() {
        getUserStream()
                .sorted(Comparator.comparing(User::getFirstName).reversed())
                .forEach(System.out::println);
    }

    /**
     * Zwraca mapę, gdzie kluczem jest typ rachunku a wartością kwota wszystkich środków na rachunkach tego typu
     * przeliczona na złotówki.
     */
    //TODO: fix
    // java.lang.AssertionError:
    // Expected :87461.4992
    // Actual   :87461.3999
    Map<AccountType, BigDecimal> getMoneyOnAccounts() {
        return getAccoutStream()
                .collect(Collectors.toMap(Account::getType, account -> account.getAmount()
                        .multiply(BigDecimal.valueOf(account.getCurrency().rate))
                        .round(new MathContext(6, RoundingMode.DOWN)), BigDecimal::add));
    }

    /**
     * Zwraca sumę kwadratów wieków wszystkich użytkowników.
     */
    int getAgeSquaresSum() {
        return getUserStream()
                .mapToInt(User::getAge)
                .map(p -> (int) Math.pow(p, 2)).sum();
    }

    /**
     * Metoda zwraca N losowych użytkowników (liczba jest stała). Skorzystaj z metody generate. Użytkownicy nie mogą się
     * powtarzać, wszystkie zmienną muszą być final. Jeżeli podano liczbę większą niż liczba użytkowników należy
     * wyrzucić wyjątek (bez zmiany sygnatury metody).
     */
    List<User> getRandomUsers(final int n) {
        final UserMockGenerator userMockGenerator = new UserMockGenerator();

        return Optional.of(userMockGenerator.generate().stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), collected -> {
                    Collections.shuffle(collected);
                    return collected.stream();
                }))
                .limit(n)
                .distinct()
                .collect(Collectors.toList()))
                .orElseThrow(ArrayIndexOutOfBoundsException::new);
    }

    /**
     * Zwraca strumień wszystkich firm.
     */
    private Stream<Company> getCompanyStream() {
        return holdings.stream()
                .flatMap(holding -> holding.getCompanies().stream());
    }

    /**
     * Zwraca zbiór walut w jakich są rachunki.
     */
    private Set<Currency> getCurenciesSet() {
        return getAccoutStream()
                .map(Account::getCurrency)
                .collect(Collectors.toSet());
    }

    /**
     * Tworzy strumień rachunków.
     */
    private Stream<Account> getAccoutStream() {
        return getUserStream()
                .flatMap(user -> user.getAccounts().stream());
    }

    /**
     * Tworzy strumień użytkowników.
     */
    private Stream<User> getUserStream() {
        return getCompanyStream()
                .flatMap(company -> company.getUsers().stream());
    }

    /**
     * 38.
     * Stwórz mapę gdzie kluczem jest typ rachunku a wartością mapa mężczyzn posiadających ten rachunek, gdzie kluczem
     * jest obiekt User a wartością suma pieniędzy na rachunku danego typu przeliczona na złotkówki.
     */
    //TODO: zamiast Map<Stream<AccountType>, Map<User, BigDecimal>> metoda ma zwracać
    // Map<AccountType>, Map<User, BigDecimal>>, zweryfikować działania metody
    Map<Stream<AccountType>, Map<User, BigDecimal>> getMapWithAccountTypeKeyAndSumMoneyForManInPLN() {
        return getCompanyStream()
                .collect(Collectors.toMap(
                        company -> company.getUsers()
                                .stream()
                                .flatMap(user -> user.getAccounts()
                                        .stream()
                                        .map(Account::getType)),
                        this::manWithSumMoneyOnAccounts
                ));
    }

    private Map<User, BigDecimal> manWithSumMoneyOnAccounts(final Company company) {

    }

    private BigDecimal getSumUserAmountInPLN(final User user) {

    }

    /**
     * 39. Policz ile pieniędzy w złotówkach jest na kontach osób które nie są ani kobietą ani mężczyzną.
     */
    BigDecimal getSumMoneyOnAccountsForPeopleOtherInPLN() {

    }

    /**
     * 40. Wymyśl treść polecenia i je zaimplementuj.
     * Policz ile osób pełnoletnich posiada rachunek oraz ile osób niepełnoletnich posiada rachunek. Zwróć mapę
     * przyjmując klucz True dla osób pełnoletnich i klucz False dla osób niepełnoletnich. Osoba pełnoletnia to osoba
     * która ma więcej lub równo 18 lat
     */
    Map<Boolean, Long> divideIntoAdultsAndNonAdults() {

    }
}
