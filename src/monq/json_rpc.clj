(ns monq.json-rpc
  (:require [clj-http.client :as client]))

(defn request
  ([connection method]
   (request connection method []))

  ([connection method & [params]]
   (let [{:keys [base-url base-body]} connection]
     (if-let [response (client/post base-url
                                    {:form-params (merge
                                                   {:jsonrpc "2.0" :params [] :id 1}
                                                   {:method method :params params})
                                     :content-type :json
                                     :as :json})]
       (if (= 200 (:status response))
         (apply dissoc (:body response) [:jsonrpc :id]))))))
