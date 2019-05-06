# cljc-quorum

_cljc-quorum_ is a Clojure(Script) library to talk to
[Quorum](https://github.com/jpmorganchase/quorum) over it's JSON-RPC interface.

## Usage

__Very early stage. Do not use (yet)!__

Leiningen/Boot: `[cljc-quorum "0.0.1"]`

``` clojure
(require 'cljc-quorum.eth)
(def connection {:base-url "http://localhost:8545"})
(cljc-quorum.eth/block-number connection)
```
