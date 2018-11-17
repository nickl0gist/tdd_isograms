# Isogram

Sprawdź czy słowo lub fraza jest isogramem.

Isogram (znany również jako "nieszablonowe słowo") jest słowem lub frazą pozbawioną powtorzających się liter, 
choć spacje lub myślniki mogą występować wielokrotnie.

Przykłady angielskich isogramów:

- lumberjacks
- background
- downstream
- six-year-old

Zauważ, że słowo *isograms*, nie jest isogramem ze względu na powtarzającą się literę s.

# Wskazówki

Jeśli dojdziesz do wniosku, że test o nazwie `testWorksWithGermanLetters` 
nie wykonuje się poprawnie mimo dobrej implementacji, być może dzieje się to za sprawą
JVM encoding](https://www.ibm.com/support/knowledgecenter/en/ssw_ibm_i_61/rzaha/international.htm). 
Ustaw zmienną środowiskową `JAVA_TOOL_OPTIONS` na `-Dfile.encoding=UTF8` aby pozbyć się tego problemu.
- Aby ustawić zmienną środowiskową w systemie Windows:
    1. Znajdź Komputer -> Ustawienia -> Zaawansowane ustawienia systemowe
    2. Dodaj nową zmienną środowiskową
    
- [Aby ustawić zmienną środowiskową na Macu](http://blog.lidalia.org.uk/2011/04/setting-default-java-file-encoding-to.html)

- [Aby ustawić zmienną środowiskową na Linuxie](https://unix.stackexchange.com/questions/151733/where-can-i-set-global-java-options)

# Uruchomienie testów

Możesz wywołać wszystkie testy pisząć następującą komendę

```sh
$ gradle test
```

w konsoli.

## Źródło

Wikipedia [https://en.wikipedia.org/wiki/Isogram](https://en.wikipedia.org/wiki/Isogram)

