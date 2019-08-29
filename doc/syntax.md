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
