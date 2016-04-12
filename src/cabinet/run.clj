(ns cabinet.run)
(use 'ring.adapter.jetty)
(require '[cabinet.web :as web])

(defn -main [& args]
  (run-jetty #'web/app {:port 8080}))
