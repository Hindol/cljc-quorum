(ns cljc-quorum.miner
  (:require [cljc-quorum.json-rpc]))

(defn start
  ([connection]
   (start connection []))

  ([connection & [params]]
   (cljc-quorum.json-rpc/request connection "miner_start")))

(defn stop
  [connection]
  (cljc-quorum.json-rpc/request connection "miner_stop"))
