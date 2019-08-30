# How do I...

## Functions

Define a single-arity named function?

```clj
(defn hello [name] (str "Hello, " name))
```

Define a multi-arity named function?

```clj
; Defines a hello function that sets a default name if none provided
(defn hello
    ([]     (hello "user"))
    ([name] (str "Hello, " name)))
```

Define a variadic named function?

```clj
(defn hello ([name & others] (println (str "Hello, " name) others)))

;; (hello "World" "and" "friends") ==> Hello, World (and friends)
```

Given a sequence, invoke a function using each value in the sequence as a single argument?

```clj
(apply str '("a" "b" \c))
; "abc"
```

Declare named values local to a function's lexical scope?

```clj
(defn messenger [msg]
  (let [a 7
        b 5
        c (clojure.string/capitalize msg)]
    (println a b c)
  ) ;; end of let scope
) ;; end of function
```
