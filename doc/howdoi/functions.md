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

# Threading


Pipe together multiple functions?

```clj
(defn becomeold [person]
  (-> person
      (update :age #(+ % 50))
      (assoc :hair-color "gray")))

(becomeold {:name "Alex" :age 28}) ; {:name "Alex", :age 78, :hair-color "gray"}
```

Pipe together multiple functions, where the value is passed as the last argument to the functions?

```clj
(defn sumofoddsquares [max]
  (->> max
       range
       (filter odd?)
       (map #(* % %))
       (reduce +)))

(sumofoddsquares 20)    ; 1330
```

Pipe together multiple functions, where the functions have varying insertion points?

```clj
(as-> [:foo] v
  (map name v)
  (first v)
  (.substring v 1))
; "oo"
```
