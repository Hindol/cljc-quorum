(ns cljc-quorum.json-rpc
  (:require [ajax.core :as ajax]))

(defn request
  ([connection rpc-method & {:keys [handler error-handler]}]
   (let [{:keys [base-url base-body]} connection]
     (ajax/POST base-url
                {:params (merge
                          {:jsonrpc "2.0" :params [] :id 1}
                          {:method rpc-method :params params})
                 :format :json
                 :handler handler
                 :error-handler error-handler}))))
