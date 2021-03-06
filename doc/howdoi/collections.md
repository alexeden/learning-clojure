# How do I...

## Sequential Collections

### Vectors

Create a vector without using `[ ]` literals?

```clj
(vector "a" "b" "c" "d")
```

Access an element in a vector by index?

```clj
(get ["a" "b" "c" "d"] 2)   ; c
```

Get the length of a vector?

```clj
(count ["a" "b" "c" "d"])   ; 4
```

Add elements to a vector?

```clj
(conj ["a" "b"] "c" "d")    ; ["a" "b" "c" "d"]
```

### Lists

Create a list?

```clj
(def letters '("a" "b" "c" "d"))
```

Access an element in a list by index?

You can't. Use a method like `first` or `rest`.

Add elements to a list?

```clj
(conj '("a" "b") "c" "d")
```

See the first element in a list?

```clj
(peek '("a" "b" "c" "d"))
```


## Hashed Collections

### Sets

Create a set?

```clj
(def letters #{"a" "b" "c"})
```

Add to a set?

```clj
(conj #{"a" "b"} "c")
```

Remove from a set?

```clj
(disj #{"a" "b" "c"} "b")
; #{"a" "c"}
```

Determine if a value belongs to a set?

```clj
(contains? #{"a" "b" "c"} "a")
; true
```

Create a sorted set?

```clj
(conj (sorted-set) "b" "c" "a")
; #{"a" "b" "c"}
```

Combine collections into a set?

```clj
(def ghi #{"g" "h" "i"})
(def abc ["a" "b" "c"])
(def xyz '("x" "y" "z"))
(reduce into [ghi abc xyz])
; #{"z" "x" "a" "i" "b" "y" "g" "h" "c"}
```

### Maps

Create a map?

```clj
(def scores { "A" 90, "B" 80, "C" 70 })
```

Add or update a key-value pair in a map?

```clj
(def scores { "A" 90, "B" 80, "C" 70 })
(assoc scores "D" 60)
```

Remove a key-value pair from a map?

```clj
(def scores { "A" 90, "B" 80, "C" 70 })
(dissoc scores "B")
```

Look up a value by key?

```clj
(def scores { "A" 90, "B" 80, "C" 70 })

; Method 1
(get scores "A")

; Method 2 - Should only be used if you can guarantee the map is non-nil
(scores "A")
```

Look up a value by key, but provide a default value if it's not found?

```clj
(def scores { "A" 90, "B" 80, "C" 70 })

(get scores "D" 60)
; or
(scores "D" 60)
```

Determine if a map contains a key-value pair by key?

```clj
(contains { "A" 90, "B" 80, "C" 70 } "A") ; true
```

Get a key-value pair (as a vector) from a map by key?

```clj
(find { "A" 90, "B" 80, "C" 70 } "A") ; ["A" 90]
```

Get a list of a map's keys or values?

```clj
(keys { "A" 90, "B" 80, "C" 70 }) ; ("A" "B" "C")
(vals { "A" 90, "B" 80, "C" 70 }) ; (90 80 70)
```

Create a map from a collection of keys and a collection of values?

```clj
; Using zipmap
(def grades #{ "A", "B", "C" })
(zipmap grades (repeat 0)) ; {"C" 0, "B" 0, "A" 0}

; Using map and into
(into {} (map (fn [grade] [grade 0]) grades)) ; {"C" 0, "B" 0, "A" 0}
```

Combine two maps?

```clj
(def scores1 { "A" 95, "B" 85, "C" 75 })
(def scores2 { "A-" 90, "B-" 80, "C-" 70 })
(merge scores1 scores2)
; {"A" 95, "B" 85, "C" 75, "A-" 90, "B-" 80, "C-" 70}
```

Combine two maps whose keys might collide?

```clj
(def scores1 { "A" 95, "B" 85, "C" 75 })
(def scores2 { "A" 95, "B" 85, "C" 75 })
(merge-with + scores1 scores2)
; {"A" 190, "B" 170, "C" 150}
```

Access a value in a map whose key is a keyword?

```clj
(def scores { :A 90, :B 80, :C 70 })
(:A scores) ; 90
```

Access a nested value within map?
```clj
(def loc { :addr { :city "KC", :state "MO", :zip 64108 }})
(get-in loc [:addr :zip]) ; 64108
```

Add or update a nested key-value pair in a map?
```clj
(def loc { :addr { :city "KC", :state "MO", :zip 64108 }})
(assoc-in loc [:addr :city] "Kansas City")
; {:addr {:city "Kansas City", :state "MO", :zip 64108}}
```

### Records

Define a record structure?

```clj
(defrecord Person [first-name last-name])
```

Instantiate a record using its positional constructor?

```clj
(def me (->Person "Alex" "Eden"))
```

Instantiate a record using its map constructor?

```clj
(def me (map->Person {:first-name "Alex" :last-name "Eden"}))
```
