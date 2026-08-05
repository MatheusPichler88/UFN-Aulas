const jwt = require('jsonwebtoken');
const SECRET = 'segredo123';

function generateToken(user) {
    return jwt.sign({ id: user.id,}, SECRET, { expiresIn: '1h' });
}

function verifyToken(req, res, next){
    const authHeader = req.headers['authorization'];
    if (!authHeader) {
        return res.status(401).send({ message: 'Token não fornecido' });
    }

    const token = authHeader.startsWith('Bearer ') ? authHeader.slice(7) : authHeader;

    jwt.verify(token, SECRET, (err, decoded) => {
        if (err) {
            return res.status(401).send({ message: 'Token inválido' });
        }

        req.userId = decoded.id;
        next();
    });
}

module.exports = {
    generateToken,
    verifyToken
};