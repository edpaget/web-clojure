(ns leiningen.new.ed-web
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "ed-web"))

(defn ed-web
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["README.md" (render "README.md" data)]
             ["COPYING" (render "COPYING")]
             ["dev/user.clj" (render "user.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/web/server.clj" (render "server.clj" data)]
             ["src/{{sanitized}}/system.clj" (render "system.clj" data)])))
