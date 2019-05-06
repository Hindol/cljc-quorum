(ns cljc-quorum.core
  (:require [cljc-quorum.json-rpc]
            [cljc-quorum.eth]
            [cljc-quorum.miner]))

(def connection
  {:base-url "http://localhost:8545"})

(defn rpc-modules
  [connection]
  (cljc-quorum.json-rpc/request connection "rpc_modules" {:handler #(prn %)
                                                   :error-handler #(prn %)}))
