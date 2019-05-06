(defproject com.github.hindol/cljc-quorum "0.0.1"
  :description "Quroum (blockchain) JSON-RPC wrapper in Clojure"
  :url "https://github.com/Hindol/cljc-quorum"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [cljs-ajax "0.8.0"]
                 [cheshire "5.8.1"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :deploy-repositories [["clojars"  {:sign-releases false}]])
