# How do I...

## Debugging

Get a value's type?

```clj
(type 10) ; java.lang.Long
```

Print values to the console?

```clj
(println "1 + 1 =" (+ 1 1))
```

Enable REPL helpers (`doc`, `apropos`, `source`, `dir`, etc)?

```clj
(require '[clojure.repl :refer :all])
```

Use the last two results from the REPL in an expression

```clj
(+ *1 *2)
```
