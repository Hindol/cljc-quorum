(ns monq.core
  (:require [monq.json-rpc]
            [monq.eth]
            [monq.miner]))

(def connection
  {:base-url "http://localhost:8545"})

(defn rpc-modules
  [connection]
  (monq.json-rpc/request connection "rpc_modules" {:handler #(prn %)
                                                   :error-handler #(prn %)}))

(rpc-modules connection)
