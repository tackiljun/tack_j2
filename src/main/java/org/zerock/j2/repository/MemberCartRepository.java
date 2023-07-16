package org.zerock.j2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.j2.entity.MemberCart;

public interface MemberCartRepository extends JpaRepository<MemberCart, Long> {
}
