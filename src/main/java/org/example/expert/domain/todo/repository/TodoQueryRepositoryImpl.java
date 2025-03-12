package org.example.expert.domain.todo.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.todo.entity.QTodo;
import org.example.expert.domain.todo.entity.Todo;

import java.util.Optional;

@RequiredArgsConstructor
public class TodoQueryRepositoryImpl implements TodoQueryRepository{
    QTodo qTodo = QTodo.todo;

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Optional<Todo> findByIdWithUser(Long todoId) {
        return Optional.ofNullable(jpaQueryFactory.select(qTodo)
                .from(qTodo)
                .leftJoin(qTodo.user)
                .fetchJoin()
                .where(qTodo.id.eq(todoId))
                .fetchOne()
        );
    }
}
