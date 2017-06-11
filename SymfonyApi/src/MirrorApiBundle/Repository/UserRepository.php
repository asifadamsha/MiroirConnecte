<?php
namespace MirrorApiBundle\Repository;
use MirrorApiBundle\Entity\User;

/**
 * UserRepository
 *
 * This class was generated by the Doctrine ORM. Add your own custom
 * repository methods below.
 */
class UserRepository extends \Doctrine\ORM\EntityRepository
{
    /**
     * @param $userId int
     * @return User
     */
    public function getUserAndModules($userId)
    {
        return $this->_em->createQueryBuilder()
            ->select('u', 'm')
            ->from('MirrorApiBundle:User', 'u')
            ->leftJoin('u.modules', 'm')
            ->andWhere('u.id = :userId')
            ->setParameter('userId', $userId)
            ->getQuery()
            ->getSingleResult();
    }
}
