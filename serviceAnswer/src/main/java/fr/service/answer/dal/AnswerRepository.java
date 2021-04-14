package fr.service.answer.dal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.service.answer.data.Answer;

/**
 * @author yannk
 *
 */
@RepositoryRestResource(collectionResourceRel = "answer", path = "answer")
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long> {

}
