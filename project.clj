(defproject cabinet "0.0.1"
  :description "REST datastore interface."
  :dependencies
    [[clj-json "0.5.3"]
     [compojure "1.5.0"]
     [javax.servlet/servlet-api "2.5"]
     [org.clojure/clojure "1.7.0"]
     [ring "1.4.0"]
     [slingshot "0.12.2"]
     [ring-json-params "0.1.3"]]
  :dev-dependencies
    [[lein-run "1.0.0-SNAPSHOT"]]
  :main cabinet.run)
