package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Enumerated;


public enum BookingStatus {
    PENDING,
    CANCELLED,
    SUCCESSFUL,
    FAILED
}
