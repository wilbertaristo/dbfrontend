(ns dbfrontend.core
    (:require 
              [reagent.core :as reagent]
              [reagent.dom :as rd]
              [dbfrontend.library :as library]
              [dbfrontend.login :as login]
              [dbfrontend.resetpassword :as resetpassword]
              [dbfrontend.signup :as signup]
              [dbfrontend.reviews :as reviews]))

(enable-console-print!)

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"
                          :searchText ""
                          :searchedColumn ""}))

(defn render [page]
  (rd/render [page] (. js/document (getElementById "app"))))

(render library/render)

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
