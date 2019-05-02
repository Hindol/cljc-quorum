(ns monq.core
  (:require [monq.json-rpc]
            [monq.eth]
            [monq.miner])
  (:gen-class))

(def connection
  {:base-url "http://localhost:8545"})

(defn rpc-modules
  [connection]
  (monq.json-rpc/request connection "rpc_modules"))

(defn -main
  [& args]
  (monq.eth/block-number connection))
