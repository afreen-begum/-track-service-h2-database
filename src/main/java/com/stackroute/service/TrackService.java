package com.stackroute.service;

import com.stackroute.domain.Track;

import java.util.List;
import java.util.Optional;

public interface TrackService {
    public Track saveTrack(Track track);
    public Track getTrackById(int id);
    public Optional<Track> deleteTrackById(int id);
    public List<Track> getAllTracks();
    public Track updateTrack();
}
