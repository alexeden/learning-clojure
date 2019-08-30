# How do I...

## Strings

Combine two strings and/or characters?

```clj
(str "a" "b" \c)
; "abc"
```

Combine a list of strings/characters?
```clj
(apply str '("a" "b" \c))
; "abc"
```
