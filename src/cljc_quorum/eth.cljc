(ns cljc-quorum.eth
  (:require [cljc-quorum.json-rpc]))

(defn block-number
  [connection]
  (cljc-quorum.json-rpc/request connection "eth_blockNumber"))

(defn transaction-count
  [connection & [address block-number]]
  cljc-quorum.json-rpc/request connection "eth_getTransactionCount")
