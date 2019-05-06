(ns monq.eth
  (:require [monq.json-rpc]))

(defn block-number
  [connection]
  (monq.json-rpc/request connection "eth_blockNumber"))

(defn transaction-count
  [connection & [address block-number]]
  monq.json-rpc/request connection "eth_getTransactionCount")
