package com.project.results.repository;

import com.project.results.domain.Cop;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CopRepository extends CrudRepository<Cop, Long> {

    @Override
    List<Cop> findAll();

    @Override
    Cop save(Cop cop);

    @Override
    Optional<Cop> findById(Long cop_id);

    @Override
    long count();

}
