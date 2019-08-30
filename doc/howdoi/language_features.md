# How do I...

## Sequential Destructuring

Destruct a vector?

```clj
;; Without nested destructuring
(defn printline [line]
  (let [[p1 p2] line
        [x1 y1] p1
        [x2 y2] p2]
    (println "Line from (" x1 "," y1 ") to (" x2 ", " y2 ")")))
(printline [[1 5] [5 -2]])
; Line from ( 1 , 5 ) to ( 5 ,  -2 )

;; Nested
(defn printline [line]
  (let [[[x1 y1 :as p1] [x2 y2 :as p2]] line]
    (println "Line from (" x1 "," y1 ") to (" x2 ", " y2 ")")))
(printline [[1 5] [5 -2]])
```

Destruct an item from a collection and retain a binding to the remaining items?

```clj
(def names ["Michael" "Amber" "Aaron" "Nick" "Earl" "Joe"])
(let [[item1 & remaining] names]
  (println item1)
  (apply println remaining))
```

Destruct an item from a collection and retain a binding to the entire collection?

```clj
(def names ["Michael" "Amber" "Aaron" "Nick" "Earl" "Joe"])
(let [[item1 :as all] names]
  (println "The first name from" all "is" item1))
```

Destruct an item from a collection AND retain a binding to the remaining items AND retain a binding to the entire collection?

```clj
(def names ["Michael" "Amber" "Aaron" "Nick" "Earl" "Joe"])
(let [[item1 & rest :as all] names] (println item1 rest all))
```

Ignore destructed items from a collection?

```clj
(def names ["Michael" "Amber" "Aaron" "Nick" "Earl" "Joe"])
(let [[item1 _ item3 _ item5 _] names]
  (println "Odd names:" item1 item3 item5))
```

## Associative Destructuring

Destructure a map?

```clj
(def me {:first-name "Alex" :last-name "Eden"})
(let [{first :first-name last :last-name} me]
  (println "Hello," first last))
```

Destructure a map by providing the keyword keys I want?

```clj
(def me {:first-name "Alex" :last-name "Eden"})
(let [{:keys [first-name last-name]} me]
  (println "Hello," first-name last-name))
```


Destructure a map and provide a default value if a key is not found?

```clj
(def me {:first-name "Alex" :last-name "Eden"})
(let [{ first :first-name, age :age, :or {age 28}} me]
  (println first "is" age "years old."))
```

Destructure a map and retain a binding to it?
```clj
(def me {:first-name "Alex" :last-name "Eden"})
(let [{first :first-name last :last-name :as all} me]
  (println "Hello," first last all))
```
