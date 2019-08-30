# How do I...

## Flow Control

Use an if/else?

```clj
(if (even? 2) "even" "odd") ; "even"
```

Use an if/else to conditionally evaluate multiple expressions?

```clj
(if (even? 5)
  (do (println "even") true)
  (do (println "off") false))
; false
```

Evaluate multiple expressions only if a condition evaluates to true?

```clj
(when (neg? x)
  (throw (RuntimeException. (str "x must be positive: " x))))
```

Evaluate a series of expressions in order and return a value for the first test expression that evaluates to true?

```clj
(let [x 5]
  (cond
    (< x 2) "x is less than 2"
    (< x 10) "x is less than 10"
    :else "x must be more than 10"))
; "x is less than 10"
```

Use a `switch` block?

```clj
(defn foo [x]
    (case x
        5 "x is 5"
        10 "x is 10"
        "x isn't 5 or 10"))
(foo 10) ; "x is 10"
```

## Iterating with Side Effects

Evaluate an expression n number of times?

```clj
(dotimes [i 3] (println i))
; 0
; 1
; 2
; nil
```

Iterate over a sequence and evaluate an expression for each element?

```clj
(doseq [n (range 3)] (println n))
; 0
; 1
; 2
; nil
```

## List Comprehensions

Get a list of all possible permutations of two sequences?

```clj
(for [x [:a :b]
      i (range 3)]
  [x i])
; ([:a 0] [:a 1] [:a 2] [:b 0] [:b 1] [:b 2])
```

## Recursion
