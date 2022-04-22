
import PropTypes from 'prop-types'

function User(props){
    console.log(props);

    if(!props.isLoggedIn) {
        return <div>Geriş yapmadınız</div>;
    }

    return(
        <>
            <h1>
                {` ${props.name} ${props.surname} ${props.age}`}
            </h1>

            {props.address.title}  {props.address.zip}
            <br/>
            <br/>

            {
                props.friends.map((friend, index) => (
                <div key={index}> {index+1} - {friend}</div>
            ))}
            
        </>
    )
}

User.propTypes = {
    name: PropTypes.string.isRequired,
    surname: PropTypes.string.isRequired,
    isLoggedIn: PropTypes.bool.isRequired,
    age: PropTypes.oneOfType([
        PropTypes.number,
        PropTypes.string
    ]).isRequired,
    friends: PropTypes.array,
    address: PropTypes.shape({
        title: PropTypes.string,
        zip: PropTypes.number,
    })

}

User.defaultProps = {
    name: "isimsiz",
    isLoggedIn: false,
}


export default User;