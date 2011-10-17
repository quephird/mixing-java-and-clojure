(ns com.quephird.mjac.bar
 (:gen-class)
 (:import [com.quephird.mjac Foo]))

(defn -main [& args]
  (let [foo (Foo.)]
    (.saySomething foo)
    (println "I am in bar.clj!!!")))

