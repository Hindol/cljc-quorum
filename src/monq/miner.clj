(ns monq.miner
  (:require [monq.json-rpc]))

(defn start
  ([connection]
   (start connection []))

  ([connection & [params]]
   (monq.json-rpc/request connection "miner_start")))

(defn stop
  [connection]
  (monq.json-rpc/request connection "miner_stop"))
