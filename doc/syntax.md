### Named function

```clj
;;    name   params         body
;;    -----  ------  -------------------
(defn greet  [name]  (str "Hello, " name) )
```

### Anonymous function

```clj
;;    params         body
;;   ---------  -----------------
(fn  [message]  (println message) )
```

### Immediately-invoked anonymous function

```clj
;;     operation (function)             argument
;; --------------------------------  --------------
(  (fn [message] (println message))  "Hello world!" )

;; Hello world!
```

### Anonymous function shorthand (`#()`)

This syntax omits the parameter list and names parameters based on their position:

- `%` is used for a single parameter
- `%1`, `%2`, `%3`, etc are used for multiple parameters
- `%&` is used for any remaining (variadic) parameters

```clj
#(+ %1 %2)
; Equivalent to: (fn [x y] (+ x y))
```


### Lexical scope bindings (`let`)

```clj
;;      bindings     name is defined here
;;    ------------  ----------------------
(let  [name value]  (code that uses name))
```
