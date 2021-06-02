package com.tts.TwitterApp.respository;

import com.tts.TwitterApp.model.Tag;
import com.tts.TwitterApp.model.Tweet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

    Tag findByPhrase(String phrase);

}
