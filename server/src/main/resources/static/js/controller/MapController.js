/**
 * Created by mhotan on 5/11/14.
 */
var MapController = function (view, model) {

    // Keep track of all the markers
    var markers = [];

    // Keep track of all the marker click handlers
    var markerClickHandlers = [];

    this.update = function() {
        // TODO Set the contents of the map based off the current station of the model
        model.getAllStations(function(result) {
            view.showStations(result);
        });
    };

    // All listening classes that must implement
    // all the menu options controller listener functions.
    var listeners = [];

    // Add the listener.
    this.addListener = function(listener) {
        listeners.push(listener);
    }

    // Notify the application listeners some kind of interaction occured
    var notifyListeners = function(map) {
        // TODO iterate through all the listeners.
    }

    this.update();
}