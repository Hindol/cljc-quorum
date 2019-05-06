# cljc-quorum

_cljc-quorum_ is a Clojure(Script) library to talk to
[Quorum](https://github.com/jpmorganchase/quorum) over it's JSON-RPC interface.

[![Clojars Project](https://img.shields.io/clojars/v/com.github.hindol/cljc-quorum.svg)](https://clojars.org/com.github.hindol/cljc-quorum)

## Usage

__Very early stage. Do not use (yet)!__

``` clojure
(require 'cljc-quorum.eth)
(def connection {:base-url "http://localhost:8545"})
(cljc-quorum.eth/block-number connection)
```
