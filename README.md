# Reference

### Character types

Type | Syntax
--- | ---
string | `"hello"`
character | `\e`
regular expression | `#"[0-9]+"`


### Symbols and idents

Type | Syntax
--- | ---
symbol | `map`
symbol | `+`
namespaced symbol | `clojure.core/+`
null value | `nil`
booleans | `true false`
keyword | `:alpha`
keyword with namespace | `:release/alpha`

Keywords evaluate to themselves and are used as enumerated values or attribute names.

### Collections (4 of them)

Type | Syntax
--- | ---
list | `'(1 2 3)`
vector | `[1 2 3]`
set | `#{1 2 3}`
map | `{:a 1, :b 2}`


### Linkage

Type | Syntax
--- | ---
var | `(def x 7)`


`defn` defines a named function
